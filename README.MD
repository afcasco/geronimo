# REST API per el projecte CentreEnXarxa


## Default Data:

#### La classe GeronimoAPI implementa la interface CommandLineRunner, amb la qual cada cop que arranca es crean els rols necessaris (ROLE_AMDIN, ROLE_USER, ROLE_CARE) a mes de un usuari per defecte "root" amb le rol ROLE_ADMIN, que permet canviar els rols dels usuaris registrats.

## Endpoints:

### Auth:

#### Register a new user:

* /api/v1/auth/signup

        {
            "username": "username"
            "email": "email"
            "password": "password"
        }

#### User login:

* api/v1/auth/signin

        {
            "username": "username"
            "password": "password"
        }

#### User logout:

* /api/v1/auth/signout

      Logout current user

#### Refresh an expired JWT token:

* /api/v1/auth/refreshtoken
   
        Uses stored refresh token to generate a new 
        JWT token when the current one is expired.

    


    
    