# Decola Tech 2025 

Java Restful API criada para o Decola Tech 2025.

## Diagrama de Classes:

```mermaid

classDiagram
    class Usuario {
        +String name
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
    
    Usuario "1" *-- "1" Conta : possui
    Usuario "1" *-- "N" Funcionalidade : tem *
    Usuario "1" *-- "1" Cartao : possui
    Usuario "1" *-- "N" Noticia : recebe
```
