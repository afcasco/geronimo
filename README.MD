# REST API per el projecte CentreEnXarxa
<hr>

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

    


    
    