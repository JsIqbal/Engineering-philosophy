# One component should have its own interface of the particular props it uses so that all the interface properties are not imported directly.

Dependency Inversion principle
One entity should depend upon abstractions not concretions. DIP

# Custom Hooks
Custom React hooks are reusable functions that can encapsulate and abstract away some of the common and often repetitive logic in React components. Here are some scenarios where custom React hooks can be useful:

State management: If you find yourself writing the same code to manage state in multiple components, you can create a custom hook to handle that logic for you. For example, you can create a hook to manage form state or to handle API calls.

Handling side effects: If you have code that handles side effects like fetching data from an API or interacting with the browser's local storage, you can create a custom hook to handle that logic for you.

Abstracting complex logic: If you have complex logic that you need to reuse across multiple components, you can create a custom hook to encapsulate that logic and make it more reusable.

Improving readability: Custom hooks can improve the readability of your code by abstracting away complex logic and making your components more focused on rendering UI.

# Here are some reasons why you should use custom React hooks:

Reusability: Custom hooks make it easy to reuse logic across different components, reducing duplication and making your code more modular.

Abstraction: Custom hooks allow you to abstract away complex logic and make your components more focused on rendering UI.

Simplification: Custom hooks simplify your code by removing the need for repetitive code and providing a centralized place to manage state and side effects.
