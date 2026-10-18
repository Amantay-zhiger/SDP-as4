# Software Design Patterns — Assignments 2 & 3

This repository contains the completed work for the Hotel Factory assignment and the Bridge pattern assignment.

## Assignment #2 — Factory Method & Abstract Factory

### Topic
Hotel Booking / Hotel Services

The project demonstrates two creational design patterns:

1. Factory Method
2. Abstract Factory

### Part A — Factory Method

Factory Method creates one type of product: a hotel room.

Products:
- StandardRoom
- LuxuryRoom

Creators:
- StandardRoomCreator
- LuxuryRoomCreator

The `RoomCreator` class declares the factory method `createRoom()`.

### Part B — Abstract Factory

Abstract Factory creates a family of related hotel products.

Product types:
- Room
- HotelService

Families:
- Standard Hotel
- Luxury Hotel

Factories:
- StandardHotelFactory
- LuxuryHotelFactory

Each concrete factory creates a consistent family of products.

## Assignment #3 — Bridge Pattern

### Topic
Notification System

The Bridge pattern separates the notification abstraction from the message-sending implementation. The same notification type can work with different sending mechanisms without changing the abstraction classes.

### Bridge Components

**Abstraction:**
- `Notification`

**Refined Abstractions:**
- `AlertNotification`
- `ReminderNotification`

**Implementor:**
- `MessageSender`

**Concrete Implementors:**
- `EmailSender`
- `SmsSender`

**Client:**
- `bridge.Main`

### Runtime Switching

The client creates an `AlertNotification` with `EmailSender`, then uses the same abstraction with `SmsSender`. The notification abstraction does not need to know the implementation details of email or SMS.

## Clean Code Principles — Assignment #3

1. **Separation of responsibilities** — notification classes handle notification behavior, while sender classes handle low-level message delivery.
2. **Meaningful names** — names such as `Notification`, `MessageSender`, `EmailSender`, and `ReminderNotification` clearly describe each role.
3. **Small, focused classes** — each class has a limited and clear responsibility.
4. **No duplicated implementation logic** — email and SMS implementations independently perform their own sending behavior through the common interface.
5. **Backward-compatible design** — a new sender such as `PushSender` can implement `MessageSender` without modifying the existing notification abstractions.

## Project Structure

```text
src/
├── hotel/
│   ├── Main.java
│   ├── factorymethod/
│   └── abstractfactory/
│
└── bridge/
    ├── Main.java
    ├── abstraction/
    │   ├── Notification.java
    │   ├── AlertNotification.java
    │   └── ReminderNotification.java
    └── implementation/
        ├── MessageSender.java
        ├── EmailSender.java
        └── SmsSender.java
```

## How to Run

Open the project in IntelliJ IDEA.

Run `src/hotel/Main.java` to demonstrate Assignment #2.

Run `src/bridge/Main.java` to demonstrate Assignment #3.

Both parts are independent and use different packages, so they can be demonstrated separately in the same project.
