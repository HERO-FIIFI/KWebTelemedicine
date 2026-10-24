package com.korlebu.audit;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Document("audit_events")
public class AuditEvent {
    @Id private String id;
    private String action;
    private String resource;
    private String resourceId;
    private Instant occurredAt = Instant.now();
    public AuditEvent() {}
    public AuditEvent(String action, String resource, String resourceId) { this.action=action; this.resource=resource; this.resourceId=resourceId; }
    public String getId(){return id;} public String getAction(){return action;} public String getResource(){return resource;} public String getResourceId(){return resourceId;} public Instant getOccurredAt(){return occurredAt;}
}
