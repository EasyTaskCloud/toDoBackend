CREATE TABLE benutzer (
    id BIGSERIAL PRIMARY KEY,
    vorname VARCHAR(100) NOT NULL,
    nachname VARCHAR(100) NOT NULL,
    bildpfad VARCHAR(255)
);

CREATE TABLE todo (
    id BIGSERIAL PRIMARY KEY,
    benutzer_id BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    summary TEXT,
    due_date DATE,
    CONSTRAINT fk_benutzer FOREIGN KEY(benutzer_id) REFERENCES benutzer(id) ON DELETE CASCADE
);