# README pour quoteManager (Back-end, port 8081)

## Installation et exécution
1.	Configuration de la base de données :
	  - Exécute le script SQL situé dans :
       ```
      src/main/java/com/example/quoteManager/Ressources/schema.sql
      ```
    - Ce script crée la base de données et la table quote.

2.	Lancer l’application :
  	- Assure-toi d’avoir Java 17+ et Spring Boot installés.
    - Compile et exécute avec :
      ```
      mvn spring-boot:run
      ```
    - L’API sera disponible sur http://localhost:8081.

## Route utilisée
- ```GET /quote/random``` → Retourne une citation aléatoire au format JSON.

