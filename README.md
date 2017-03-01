Auteurs : 
    Thomas HOUSET
	Cherif TOURE
	Guillaume ONGENAE
	Yann GARBE

* RESUME : Il s'agit d'un programme java d'analyse de syntaxe, principalement afin d'analyser des textes politiques.

* TUTORIEL : Pour l'instant, le plus facile est de le lancer sous eclipse, à cause des dépendance avec les API (qui sont dans le répertoire `Librairies/`

* TO DO : 
	- Plus de filtre, toujours plus de filtres
	- Plus d'analyses aussi
	- Avoir des idée pour l'analyse de champ lexical.
	- Les plus : 
		- Comparaision entre deux textes
		- Peut être une petite campagne de tests?

* DOING : 
	- Mise en place d'un filtrage de mots parasites ("le", "du", etc...).
	- Option : les mots les plus utilisés.
	- Vérification de la priorité de lecture de fichiers PDF.
	- Petites amélioration de lecture de fichiers .txt.
	- Quelques commentaires pour rendre le code plus explicite.

* DONE : 
	- Une conception de projet potable, permettant l'implémentation de code relativement ludique. 
	- Une bonne partie de la javadoc (le reste est relativement explicite).
	- Les Filtres : 
		- PDF (API)
		- TXT (sans les retours chariots)
	- Les analyses : 
		- Affichage de texte (peut toujours servir)
		- Comptage de lignes
		- Comptage d'occurences d'un mot choisi par l'utilisateur (avec en cadeau le nombre de mots dans le texte)	
		- Classement des mots associés les plus utilisés avec celui demandé par l'utilisateur

(PS : Ligne de commande pour lancer le projet : java -jar target/projet-1.0-SNAPSHOT.jar)

