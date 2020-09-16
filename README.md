# Moussa Ndiaye
## junior software Ingenieur

### Test numero 1:
Je suis parti de l'idée que la problematique de la recherche des differentes combinaisons de parties gagnées à 1 ou 2 points
pour arriver à 26 points pouvait etre vue comme la realisation d'un arbre.


Sur chaque branche de cette arbre on aura la combinaison precetende auquel on ajoute un 1 ou un 2 lorsque cette ajout 
est possible(on ne depasse pas 26), on retrouve aussi sur la branche l'adresse des deux prochaines combinaisons.


On aura fini de parcourir l'arbre lorsque ou la somme des element dans la combinaison vaut 26.

Il y a donc ``75025`` combinaisons de 1 et 2 pour atteindre un total de 26
En voila quelques unes:
```
2 2 2 2 2 2 2 2 1 1 2 2 1 1 1 
2 2 2 2 2 2 2 2 1 1 2 2 2 
2 2 2 2 2 2 2 2 1 2 1 1 1 1 1 1 
2 2 2 2 2 2 2 2 1 2 1 1 1 2 
2 2 2 2 2 2 2 2 1 2 1 1 2 1 1 
2 2 2 2 2 2 2 2 1 2 1 2 1 1 1 
2 2 2 2 2 2 2 2 1 2 1 2 2 
2 2 2 2 2 2 2 2 2 1 2 2 1 1 
2 2 2 2 2 2 2 2 2 2 1 1 1 1 1 
2 2 2 2 2 2 2 2 2 2 1 1 2 
2 2 2 2 2 2 2 2 2 2 1 2 1 1 
2 2 2 2 2 2 2 2 2 2 2 1 1 1 
2 2 2 2 2 2 2 2 2 2 2 2 
```
