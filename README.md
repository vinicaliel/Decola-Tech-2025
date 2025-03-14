# Decola Tech 2025 

Java Restful API criada para o Decola Tech 2025.

## Diagrama de Classes:

```mermaid

classDiagram
    class User{
        +String name
        +Account account
        +Feature[] features
        +Card card
        News[] news
    }
    
    class Conta {
        +String number
        +String agency
        +Double balance
        +Double limit
    }
    
    class Funcionalidade {
        +String icon
        +String description
    }
    
    class Cartao {
        +String number
        +Double limit
    }
    
    class Noticia {
        +String icon
        +String description
    }
    
    User "1" *-- "1" Conta : possui
    User "1" *-- "N" Funcionalidade : tem *
    User "1" *-- "1" Cartao : possui
    User "1" *-- "N" Noticia : recebe
```
