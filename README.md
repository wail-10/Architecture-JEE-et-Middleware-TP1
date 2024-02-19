# Activité Pratique N°1 - Inversion de contrôle et Injection des dépendances

Ce dépôt contient le code source réalisé dans le cadre de l'activité pratique sur l'inversion de contrôle et injection des dépendances.

## Description

L'activité pratique consistait à implémenter plusieurs interfaces et à gérer les dépendances entre ces interfaces en utilisant différentes méthodes d'injection, notamment l'injection statique, dynamique et en utilisant le Framework Spring avec les versions XML et annotations.

## Structure du Projet

Le projet est structuré comme suit :


Dans cette structure de projet :

- **src/main/java/** : Contient les fichiers sources Java.
  - **dao/** : Répertoire contenant les interfaces et implémentations relatives à la couche DAO.
    - **DaoImpl.java** : Implémentation de l'interface `IDao`.
    - **IDao.java** : Interface définissant les méthodes pour l'accès aux données.
  - **metier/** : Répertoire contenant les interfaces et implémentations relatives à la couche métier.
    - **MetierImpl.java** : Implémentation de l'interface `IMetier`.
    - **IMetier.java** : Interface définissant les méthodes métier.
  - **pres/** : Répertoire contenant les classes de présentation.
    - **Presentation.java** : Classe de présentation.
    - **Presentation2.java** : Autre classe de présentation.
    - **PresSpringAnnotation.java** : Classe de présentation utilisant Spring avec annotations.
    - **PresSpringXML.java** : Classe de présentation utilisant Spring avec configuration XML.
- **src/main/resources/** : Contient les ressources du projet.
  - **applicationContext.xml** : Fichier de configuration Spring pour l'injection de dépendances.


## Instructions d'Utilisation

1. Cloner le dépôt :

```bash
git clone https://github.com/votre-utilisateur/activite-pratique-spring.git
```
2. Importer le projet dans votre environnement de développement.

## Injection de Dépendances
Le projet illustre les différentes méthodes d'injection de dépendances :

- Injection statique : Les dépendances sont injectées en instanciant directement les classes.
- Injection dynamique : Les dépendances sont injectées dynamiquement à l'exécution.
- Injection avec Spring (XML) : Les dépendances sont gérées à l'aide du conteneur Spring en utilisant la configuration XML.
- Injection avec Spring (Annotations) : Les dépendances sont gérées à l'aide du conteneur Spring en utilisant des annotations.

## Auteur
Ce projet a été réalisé par Wail KOUNDI.
