API de Fondos de Inversión 🚀

Proyecto de prueba técnica desarrollado con Spring Boot para gestionar suscripciones a fondos de inversión.

Este proyecto demuestra desarrollo backend, integración en la nube con AWS e infraestructura como código usando CloudFormation.

🧠 Arquitectura

El sistema permite a los clientes suscribirse y cancelar fondos de inversión, validando reglas de negocio como el monto mínimo de inversión y el saldo disponible.

🔹 Estilo de Arquitectura

Arquitectura en capas:

Cliente → Controlador → Servicio → Repositorio → DynamoDB

Controladores: Manejan las solicitudes REST
Servicios: Lógica de negocio
Repositorios: Acceso a datos (DynamoDB)
🛠️ Tecnologías
Java 17
Spring Boot
Maven
Lombok
JUnit & Mockito
AWS DynamoDB
AWS SNS (notificaciones SMS)
AWS SES (notificaciones por correo electrónico)
AWS CloudFormation (Infraestructura como Código)
⚙️ Configuración Local

Ejecutar DynamoDB localmente con Docker:

docker run -p 8000:8000 amazon/dynamodb-local

-- Comando para desplegar:

aws cloudformation deploy \
  --template-file template.yml \
  --stack-name investment-funds-api \
  --capabilities CAPABILITY_NAMED_IAM
