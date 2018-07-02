#!/bin/bash

# Fügt die Git Repositories der Services als Submodule zu dem Git Repository des Wurzelverzeichnisses hinzu,
# so dass über das Wurzelverzeichnis alle Services neu gebaut und deployed werden können.
# Mehr Informationen zu Submodules: https://git-scm.com/docs/git-submodule und https://git-scm.com/book/de/v1/Git-Tools-Submodule

URL_GIT=https://gitp001.srv.ha3.dir.muenchen.de

help() {
  echo ""
  echo "Fügt die Git Repositories der Services als Submodule zu dem Git Repository des Wurzelverzeichnisses hinzu,"
  echo "so dass über das Wurzelverzeichnis alle Services neu gebaut und deployed werden können."
  echo "Voraussetzungen für die erfolgreiche Durchführung dieses Skripts:"
  echo "1. Alle Git Repositories müssen bereits existieren"
  echo "2. Alle Git Repositories müssen der gleichen Gruppe im Git zugeordnet sein."
  echo "3. Der Name der Git Repositories muss dem Namen des Service Verzeichnisses entsprechen."
  echo ""
  echo "addGitSubmodule.sh <group>"
  echo ""
  echo " <group>: Der Name der Gruppe, dem die Git Repositories zugeordnet sind."
  echo ""
  exit 0
}

if [ -z "$1" ]; then
  help
fi

REPOSITORY_GROUP=$1

URL_REPOSITORY_GROUP=$URL_GIT/$REPOSITORY_GROUP

# add testproject-commons
echo "Füge Repository $URL_REPOSITORY_GROUP/testproject-commons.git als Submodule hinzu."
git submodule add -f $URL_REPOSITORY_GROUP/testproject-commons.git

# add all testproject-service-<service>
echo "Füge Repository $URL_REPOSITORY_GROUP/testproject-service-thebackend.git als Submodule hinzu."
git submodule add -f $URL_REPOSITORY_GROUP/testproject-service-thebackend.git

# add all testproject-frontend-<guimodel>
echo "Füge Repository $URL_REPOSITORY_GROUP/testproject-frontend-thefrontend.git als Submodule hinzu."
git submodule add -f $URL_REPOSITORY_GROUP/testproject-frontend-thefrontend.git
