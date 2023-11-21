# Distributed Systems Basics

Distributed systems involve multiple interconnected computers that work together to achieve a common goal.

# Properties

## Synchronous

In a synchronous setup, computers act like a team following a strict schedule.

- **Working Together:**
  - All computers have a fixed plan, like a team dance. They move together, knowing when each step happens.

- **Time Limits:**
  - Everyone has a timer for their tasks. They know exactly how long they have for each job.

### Challenges and Best Practices

- **Challenge: Coordination**
  - It's crucial for everyone to stay in sync.
  
- **Best Practice: Communication**
  - Computers need to talk a lot to stay coordinated. Clear and constant communication is key.

## Asynchronous

In an asynchronous setup, computers are more like friends playing at a playground.

- **No Fixed Schedule:**
  - There's no strict plan. Each computer does its tasks whenever it feels like it, without waiting for others.

- **Doing Tasks:**
  - It's like friends playing—they do their things without waiting for a signal from others.

### Challenges and Best Practices

- **Challenge: Timing**
  - Tasks might finish at different times.
  
- **Best Practice: Flexibility**
  - Computers need to be flexible, ready to adapt to the unpredictable timing of others.


# Failure in Distributed Systems

In the computer teamwork, we need to know if any computer isn't doing well.

## Detection

- **How do we know?**
  - We set time limits. If a computer takes too long, we think it might be having a problem.

## Trade-offs

- **Picking Time Limits:**
  - Choosing how long to wait is tricky. Too short, and we might make mistakes. Too long, and we waste time waiting.

# Stateful vs. Stateless Systems

Think of computer systems like having a memory or not.

## Stateless

- **No Memory:**
  - Computers just look at what they have now. They don't remember what happened before.

## Stateful

- **Memory Savvy:**
  - Computers remember things in a special place (like a database). They use this info to decide what to do.

# Exactly-Once Semantics

Making sure things happen just right, even if the computer messages get a bit mixed up.

- **Challenge:**
  - Making sure a computer task happens only once, even if we get the same message more than once.

- **Solutions:**
  - Using special tasks that won't mess up even if we repeat them. Also, making sure we only pay attention to new messages.

# Failure Detectors

In the computer teamwork, we need a superhero to find out if any computer is in trouble.

- **Role:**
  - Superheroes (called failure detectors) look out for computers that might be having problems.

- **Categories:**
  - Some superheroes are really good at their job (complete), and some are careful but might make a mistake (accurate).

# System Models

How computers play together—like having a game with rules.

- **Synchronous:**
  - Computers play like in a dance, following specific steps at specific times.

- **Asynchronous:**
  - Computers play like friends at a playground. They do things when they want, without a strict schedule.
