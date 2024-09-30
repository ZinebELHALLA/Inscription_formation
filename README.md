
# Inscription Formation

## Table des matières

- [Description](#Description)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Démonstration](#Démonstration)

## Description

**Inscription Formation** est une application Android qui permet aux utilisateurs de s'inscrire à une formation via une interface simple et intuitive. L'application permet de saisir des informations personnelles telles que le nom, l'email, le téléphone, l'adresse et la ville. Après la soumission, les informations saisies sont affichées sur une nouvelle page.

## Installation

Pour exécuter ce projet localement, suivez ces étapes :

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/ZinebELHALLA/Inscription_formation.git
   ```
2. Ouvrez le projet dans **Android Studio**.
3. Laissez Android Studio configurer le projet et télécharger les dépendances nécessaires.
4. Connectez un appareil Android ou configurez un émulateur Android.
5. Cliquez sur le bouton **Run** dans Android Studio.

## Utilisation

1. Lancez l'application sur votre appareil ou émulateur Android.
2. L'écran principal présente un formulaire où vous pouvez saisir les informations suivantes :
   - **Nom et Prénom**
   - **Email**
   - **Téléphone**
   - **Adresse**
   - **Ville** (Sélectionnez une ville dans la liste déroulante)
3. Après avoir rempli le formulaire, cliquez sur le bouton **Envoyer**.
4. Vous serez redirigé vers une nouvelle page affichant un récapitulatif des informations que vous avez saisies.

### Structure du projet :

- **app/java/com.example.inscription_formation/MainActivity.java** : Gère l'interface utilisateur et la collecte des données via le formulaire.
- **app/java/com.example.inscription_formation/NextActivity.java** : Affiche le récapitulatif des informations saisies.
- **app/res/layout/activity_main.xml** : Définit l'interface du formulaire d'inscription.
- **app/res/layout/activity_next.xml** : Définit l'interface d'affichage des informations soumises.

## Démonstration

https://github.com/user-attachments/assets/fd197bf5-4e96-4754-b6bd-a7b4d9d88598



