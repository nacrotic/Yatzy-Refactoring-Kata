# Yatry Kata

Prises de notes pour le kata de refacto

## Analyse de l'existant.

Les TU couvrent 100% des methodes existantes.
Plusieurs cas limites ne sont pas testé
Les TU sont cohérents avec le besoin
L'application ne demarre pas

## Hypothèses

Le pom spécifie l'utilisation de Java 11, la montée de version est hors périmètre.

## Choix

L'algoritme d'evaluation des suite, full est paire est optimisable.
Mais le contexte ne rends pas l'optimisation imperative dans le
contexte actuel

# Reste à faire

- Reprendre les noms des methode dans la class Yatzy
- Deplacer la class Yatzy
- Documenter les evaluators (l'utilisation du ofKind pour les pair et le yatzy n'est pas trivial)