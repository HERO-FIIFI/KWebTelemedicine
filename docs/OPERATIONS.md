# Operations checklist

- TLS: deploy `deploy/nginx.conf` behind a managed certificate (for example, Let's Encrypt); do not expose the API directly.
- Backups: configure scheduled encrypted MongoDB snapshots and test restore quarterly.
- Recovery: define RPO/RTO and keep a second-region copy before handling real patient data.
- Monitoring: `/actuator/health` and `/actuator/metrics` are available; connect them to an external metrics/alerting system.
- Audit: patient CRUD access is recorded in MongoDB `audit_events`; restrict access to this collection.
- Security gap: authentication, authorization, key management, penetration testing, and healthcare compliance review are still required.
- Integrations: video, appointments, notifications, EMR, and clinical workflows require approved third-party or hospital systems.
