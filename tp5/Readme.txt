Etape 13 :
	1. @GetMapping("/greeting")
	2. return "greeting";
	3. @RequestParam(name="nameGET", required=false, defaultValue="World")

Etape 17 : Ajout de la table Address dans la base de données

Etape 18 : Gestion de persistance dans la base de données, chaque Objet dans Model correspond à une table dans la bdd.

Etape 20 : Oui, on voit bien les données récement ajoutés dans data.sql 


Etape 23 : l'annotation @Autowired permet de faire l’injection de dépendances entre les beans de l’application (Spring va tout faire).

Etape 30 : 
 	il suffit d'ajouetr ces dépendances dans pom.xml :
	<dependency>
	    <groupId>org.webjars</groupId>
	   	<artifactId>bootstrap</artifactId>
		<version>3.3.6</version>
	</dependency>

	<dependency>
	    <groupId>org.webjars</groupId>
	    <artifactId>bootstrap-datepicker</artifactId>
	    <version>1.0.1</version>
	</dependency>

	<dependency>
	    <groupId>org.webjars</groupId>
	    <artifactId>jquery</artifactId>
	    <version>1.9.1</version>
	</dependency>

Lien Github : https://github.com/lostminded/DM.git