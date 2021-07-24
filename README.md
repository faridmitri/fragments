# fragments
Exercices  Passing Data between 2 fragments

Exercice 1 (fragment Listview)
-----------------------------------
Créer une application nommée ListFragment qui contient une activité ayant 2 fragment
(L’orientation est horizontale) 
Le 1er fragment contient une ListView, le 2ème contient 2 TextView 
Lorsque qu’on clique sur un des items de la ListView (Fadi, Pierre, Roza, Mira, Jean), 
afficher dans les TextView du 2ème fragment le prénom et le profile correspondant 
(Admin, User, Student, Employee, Teacher) 


Exercice 2 (Fragment to fragment)
---------------------------------------
Créer une application nommée FragmentToFragment qui contient une activité ayant un 
fragment (Fragment1) 
Ce Fragment1 contient : 
- 1 TextView : "This is the first Fragment" 
- 2 EditText : "First Name" et "Last Name" 
- 1 bouton : "Submit" 
Lorsque qu’on clique sur le bouton "Submit", envoyer les 2 EditText saisis au 
Fragment2 qui contient : 
- 1 TextView : "This is the second Fragment" 
- 1 TextView : pour afficher le "First Name" saisi 
- 1 TextView : pour afficher le "Last Name" saisi

N.B : Utiliser la méthode Bundle

Exercice 3 (Activity to fragment)
-----------------------------------
Créer une application nommée ActivityToFragment qui contient une activité ayant : 
- 1 EditText
- 1 bouton "Show" 
- 1 FramLayout : pour afficher le Fragment 
Lorsque qu’on clique sur le bouton "Show", envoyer l’EditText saisi au Fragment1 qui 
remplace le FramLayout.
N.B : Utiliser la méthode Bundle 

exercice 4 (fragment to activity)
Créer une application nommée FragmentToActivity qui contient une activité ayant : 
- 1 TextView : "Enter your name" 
- 1 Fragment : lié au Fragment1 
Fragment1 contient : 
- 1 EditText
- 1 bouton "Show" 
Lorsque qu’on clique sur le bouton "Show", envoyer l’EditText saisi à l’activité et 
afficher dans le TextView "Your name is xxx", xxx est le text saisi dans Fragment1
