# Order Management — Bad vs Good (SOLID)

A Java 17 Maven project that keeps the original design examples in `bad` and refactors them in `good`.

## Project structure

- `src/main/java/bad/` — original-style implementation, split into separate files.
- `src/main/java/good/` — refactored implementation using SOLID principles.
- `pom.xml` — Maven project configuration.

## Run

From the project root:

```bash
mvn clean package
java -cp target/classes good.Main
```

If Maven is not installed, compile and run using Java 17:

```bash
javac -d out $(find src/main/java -name "*.java")
java -cp out good.Main
```

## SOLID changes in `good`

1. **SRP:** order processing, payment processing, and email notifications have separate classes/interfaces.
2. **OCP:** payment methods implement `PaymentMethod`; adding a payment method does not require editing `PaymentProcessor`.
3. **LSP:** pickup orders are not forced to support shipping. Only `DeliveryOrder` implements `Shippable`.
4. **ISP:** user capabilities are split into small interfaces (`Registerable`, `Loggable`, `Subscribable`).
5. **DIP:** `UserManagement` depends on abstractions and receives its collaborators through constructor injection.

The `bad` package is intentionally designed to demonstrate the problems; the `good` package demonstrates one possible refactoring.
