# Rider Sharing Platform - Load Balanced Driver Service

Modules: `eureka-server` (8761), `driver-service` (dynamic port), `api-gateway` (8080).

## Run in STS
1. File > Import > Maven > Existing Maven Projects > select this folder (all 3 modules).
2. Start `eureka-server`, then `driver-service` 3 times (Boot Dashboard > Start, repeat), then `api-gateway`.
3. Check http://localhost:8761 : DRIVER-SERVICE should show 3 instances.
4. Call `http://localhost:8080/drivers/available` many times and watch the 3 console logs rotate (round robin).

## Push to GitHub
```
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/<username>/<repo>.git
git push -u origin main
```
Use a Personal Access Token as the password. Never put the token in a file.
