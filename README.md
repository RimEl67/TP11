# TP 11 : Spring Data REST par: Rim EL ABBASSI

## Objectif
Apprendre à exposer des entités JPA via une API REST en utilisant **Spring Data REST**, et à gérer les fonctionnalités suivantes :  
- Création du projet Spring Boot avec Spring Initializr  
- Configuration de la base de données H2  
- Définition d’entités JPA et d’énumérations (`TypeCompte`)  
- Création de repositories JPA et exposition REST  
- Initialisation des données  
- Gestion des projections JSON  
- Exposition des IDs dans les réponses JSON  
- Pagination et tri des résultats  
- Gestion des relations entre les ressources (`Client` et `Compte`)  
- Ajout de requêtes de recherche personnalisées par type de compte  

## Endpoints principaux à tester
- Liste des comptes : `http://localhost:8082/api/comptes`  
- Accéder au client d’un compte : `http://localhost:8082/api/comptes/1/client`  
- Recherche par type : `http://localhost:8082/api/comptes/search/byType?t=EPARGNE`  
- Projection solde : `http://localhost:8082/api/comptes/1?projection=solde`  
- Pagination : `http://localhost:8082/api/comptes?page=0&size=2`

## Captures
<img width="1366" height="768" alt="11" src="https://github.com/user-attachments/assets/8c85aff0-1c66-4f3d-b40f-0b0059bcf339" />

## Liste des comptes : `http://localhost:8082/api/comptes`  
<img width="1366" height="768" alt="22" src="https://github.com/user-attachments/assets/4212829b-f0e0-482e-8217-2008ea383ada" />

## Accéder au client d’un compte : `http://localhost:8082/api/comptes/1/client`  
<img width="1366" height="768" alt="33" src="https://github.com/user-attachments/assets/3fcaaab2-885a-4505-9f1d-be54e5d6aa8a" />

## Recherche par type : `http://localhost:8082/api/comptes/search/byType?t=EPARGNE` 
<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/0d8301a8-6b1d-438e-b5c9-c3a7da875e53" />

## Projection solde : `http://localhost:8082/api/comptes/1?projection=solde`  
<img width="1366" height="768" alt="44" src="https://github.com/user-attachments/assets/fb728e9f-39f9-42c5-99eb-18012fbbcf85" />

## Pagination : `http://localhost:8082/api/comptes?page=0&size=2`
<img width="1366" height="768" alt="55" src="https://github.com/user-attachments/assets/632f7b67-dcbb-47d3-b1f9-4906466eb35e" />

