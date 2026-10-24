# Telemedicine MVP

A small patient registry for telemedicine workflows.

## Run locally

1. Start MongoDB: `docker compose up -d mongodb`
2. Start the API: `cd backend/java-service && mvn spring-boot:run`
3. Open `frontend/index.html` in a browser.

The API uses `MONGODB_URI` and `PORT` environment variables, with local defaults. The MVP currently provides patient CRUD only; authentication, video consultation, audit logging, and production deployment are intentionally outside this first slice.

## API

- `GET /api/patients`
- `GET /api/patients/{id}`
- `POST /api/patients`
- `PUT /api/patients/{id}`
- `DELETE /api/patients/{id}`
