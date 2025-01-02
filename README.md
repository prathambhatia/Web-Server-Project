
# Multi-Threaded and Single-Threaded Server

This project demonstrates the implementation of a server in Java that can handle up to a million requests using both single-threaded and multi-threaded approaches. The project showcases the scalability of multi-threaded servers while comparing it with the simpler but less efficient single-threaded server.

## Features

- **Single-Threaded Server**: Handles requests sequentially, suitable for scenarios with minimal or non-concurrent requests.
- **Multi-Threaded Server**: Handles requests concurrently using multiple threads, improving performance when handling high-volume traffic.
- Both servers are designed to efficiently process a high volume of requests while minimizing latency.

## Requirements

- Java 8 or later
- IDE (e.g., IntelliJ IDEA, Eclipse) or command-line setup
- Operating System: Linux/Windows/MacOS (tested on Linux)

## Installation

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/prathambhatia/Web-Server-Project.git
    cd Web-Server-Project
    ```

2. If you're using an IDE, simply import the project. If you’re using the command line, compile the Java files:

    ```bash
    javac *.java
    ```

## Usage

### Single-Threaded Server

To start the single-threaded server:

```bash
java SingleThreadedServer
```

This will start the server on `localhost` and listen for incoming requests on the default port (e.g., 8080).

### Multi-Threaded Server

To start the multi-threaded server:

```bash
java MultiThreadedServer
```

This will launch the server that can handle multiple requests simultaneously using threads.

## Performance

- The multi-threaded server is optimized for handling up to a million requests.
- The single-threaded server is more suitable for low-traffic or simple applications.

## Code Overview

- `SingleThreadedServer.java`: Contains the implementation of the single-threaded server.
- `MultiThreadedServer.java`: Contains the implementation of the multi-threaded server.
- `Utils.java`: A utility class with common functions used across both servers.

## Contributing

Feel free to fork this repository, create a branch, and submit pull requests. Contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
