/*
* Copyright (c): it@M - Dienstleister fuer Informations- und Telekommunikationstechnik
* der Landeshauptstadt Muenchen, 2018
*/
package de.muenchen.testproject.commons.unicode;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.filter.OncePerRequestFilter;


/*
 * This file will NOT be overwritten by Barrakuda.
 * This file was automatically generated by Barrakuda.
 */
/**
 * <p>Spring-Filter, der eine NFC-Normalisierung aller <em>sicher textuellen</em> Inhalte durchführt.</p>
 * 
 * <strong>Achtung:</strong>
 * <ul>
 *    <li>Alle Datenströme die in Zusammenhang mit Multipart-Requests stehen werden nicht nach NFC normalisiert.
 *        Grund ist, dass hier binäre Datenströme übergeben werden und diese i.d.R. nicht einfacher Text sind.
 *        Falls notwendig bzw. sinnvoll kann bzw. muss die Anwendungslogik oder eine geeignete Bibliothek
 *        ggf. eine NFC-Normalisierung durchgeführt werden.
 *    <li>NFC-Normalisierung kann nur auf der Zeichenebene durchgeführt werden und für die Konvertierung von 
 *        binären Datenströmen ist die Kenntnis des Datenformats notwendig, was die Kenntnis des verwendeten Charsets 
 *        impliziert. Dies lässt die NFC-Normalisierung in einem generischen Filter sinnvoll erscheinen.
 *    </li>
 * </ul>
 * 
 * @see java.text.Normalizer
 * @see javax.servlet.http.HttpServletRequest#getPart(String)
 * @see javax.servlet.http.HttpServletRequest#getParts()
 */
@Component
@ApplicationScope
public class NfcRequestFilter extends OncePerRequestFilter {

	private static final Logger LOG = LoggerFactory.getLogger(NfcRequestFilter.class);

    /**
     * Name des Properties für Konfiguration der White-List für Content-Types.
     * 
     * @see #getContentTypes()
     * @see #setContentTypes(String)
     */
    public static final String CONTENTTYPES_PROPERTY = "contentTypes";

    private Set<String> contentTypes = new HashSet<>();

    /**
     * @return
     *         Das Property <em>contentTypes</em>
     */
    public String getContentTypes() {
        return String.join("; ", this.contentTypes);
    }

    /**
     * @param contentTypes
     *         Das Property <em>contentTypes</em>
     */
    @Autowired(required=false)
    public void setContentTypes(final String contentTypes) {
        this.contentTypes.clear();
        if (isNullOrEmpty(contentTypes)) {
            LOG.info("Disabling context-type filter.");
            
        } else {
            final Set<String> newContentTypes = Arrays.asList(contentTypes.split(";")).stream().map(e -> e.trim()).collect(Collectors.toSet());
            this.contentTypes.addAll(newContentTypes);
            LOG.info("Enabled content-type filtering to NFC for: {}",String.join("; ", this.contentTypes));

        }
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

    	LOG.debug("Request-Type={}",request.getClass().getName());
        LOG.debug("Intercepting request for URI {}",request.getRequestURI());

        final String contentType = request.getContentType();
        LOG.debug("ContentType for request with URI: \"{}\"",contentType);
        if ((contentTypes != null) && (contentTypes.contains(contentType))) {
            LOG.debug("Processing request {}.",request.getRequestURI());
            filterChain.doFilter(new NfcRequest(request,contentTypes), response);        
            
        } else {
            LOG.debug("Skip processing of HTTP request since it's content type \"{}\" is not in whitelist.",contentType);
            filterChain.doFilter(request, response);
            
        }
    }
    
    private final boolean isNullOrEmpty(final String s) {
        return (s == null) || (s.trim().equals(""));
    }

}
