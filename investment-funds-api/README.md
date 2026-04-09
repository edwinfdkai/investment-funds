# Investment Funds API 🚀

Technical test project built with Spring Boot to manage investment fund subscriptions.

This project demonstrates backend development, cloud integration with AWS, and infrastructure as code using CloudFormation.

--


## 🧠 Architecture

The system allows clients to subscribe and cancel investment funds while validating business rules such as minimum investment amount and available balance.

### 🔹 Architecture Style
Layered Architecture:

Client → Controller → Service → Repository → DynamoDB

- Controllers: Handle REST requests
- Services: Business logic
- Repositories: Data access (DynamoDB)

---

## 🛠️ Technologies

- Java 17
- Spring Boot
- Maven
- Lombok
- JUnit & Mockito
- AWS DynamoDB
- AWS SNS (SMS notifications)
- AWS SES (Email notifications)
- AWS CloudFormation (Infrastructure as Code)

---

## ⚙️ Local Setup

Run DynamoDB locally with Docker:

```bash
docker run -p 8000:8000 amazon/dynamodb-local

-- Deploy command:

aws cloudformation deploy \
  --template-file template.yml \
  --stack-name investment-funds-api \
  --capabilities CAPABILITY_NAMED_IAM
