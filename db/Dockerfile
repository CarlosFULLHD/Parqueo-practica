FROM postgres:17

ENV POSTGRES_DB=parqueo
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=admin123

# Copiar el script SQL al contenedor, para que se ejecute al iniciar
COPY init.sql /docker-entrypoint-initdb.d/
