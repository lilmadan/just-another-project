When a user logs in on our API, a JWT token is issued and our webapp uses this token for
every request for authentication. Here's an example of such a token:
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFt
ZSI6IjxuYW1lPiIsImFkbWluIjpmYWxzZX0.Hjrg9Ntw6qUjTeRbYM_-
PL5Bnh6dVZHfQJ6Ou_BWhRk
Why and when is it (or isn't it) safe to use this?


I personally love to use JSON Web Tokesn, as this is simple both in UI and Server Side. This has its own pros and cons based on the specific scenarios

Case 1

Not So Safe Place - Storing JWT in localstorage / sessionstorage risks of being token stolen. However this can be stored in Cookies 

Case 2

Sweet Spot - Parsing JWT in HTTP Headers is a recommended approach where JWTs hold on to Applicaiton level and will be helpful both UI and APIs
