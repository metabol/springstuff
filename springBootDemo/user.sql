CREATE USER 'jnmaju'@'*' IDENTIFIED BY 'jnmaju';
CREATE USER 'jnmaju'@'localhost' IDENTIFIED BY 'jnmaju';

GRANT ALL PRIVILEGES ON * . * TO 'jnmaju'@'localhost';
GRANT ALL PRIVILEGES ON * . * TO 'jnmaju'@'*';

