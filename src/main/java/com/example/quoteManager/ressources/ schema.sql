-- Création de la base de données si elle n'existe pas
CREATE DATABASE IF NOT EXISTS BearSeller;
USE BearSeller;

-- Création de la table quote
CREATE TABLE IF NOT EXISTS quote (
    id INT AUTO_INCREMENT PRIMARY KEY,
    text VARCHAR(500) NOT NULL,
    author VARCHAR(255) NOT NULL
);

-- Insertion de quotes inspirantes
INSERT INTO quote (text, author) VALUES
('The only way to do great work is to love what you do.', 'Steve Jobs'),
('Success is not final, failure is not fatal: it is the courage to continue that counts.', 'Winston Churchill'),
('Believe you can and you’re halfway there.', 'Theodore Roosevelt'),
('Happiness depends upon ourselves.', 'Aristotle'),
('Do what you can, with what you have, where you are.', 'Theodore Roosevelt'),
('Act as if what you do makes a difference. It does.', 'William James'),
('Keep your face always toward the sunshine—and shadows will fall behind you.', 'Walt Whitman');