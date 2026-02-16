# 🎉 otel-demo-app - Easily Monitor Your Application

## 📥 Download Now
[![Download](https://img.shields.io/badge/Download-via_GitHub-blue)](https://github.com/kareem102/otel-demo-app/releases)

## 🏷️ Description
The otel-demo-app is a small Spring Boot service designed to help you understand observability. It showcases how to use OpenTelemetry and Micrometer for structured logs, distributed tracing, and application metrics. With this application, you can see your application's health in real-time and gain insights into performance issues.

## 🚀 Getting Started
This section will guide you through downloading and running the otel-demo-app on your computer.

### 📋 System Requirements
- Windows, macOS, or Linux
- Java 8 or higher installed on your system
- At least 512 MB of RAM
- 100 MB of disk space

### 📥 Download & Install
To get started, visit the Releases page on GitHub to download the otel-demo-app. Click the button below to access the downloads:

[Download from GitHub Releases](https://github.com/kareem102/otel-demo-app/releases)

1. Open your web browser.
2. Go to the [Releases page](https://github.com/kareem102/otel-demo-app/releases).
3. Look for the latest version of the software.
4. Download the file that ends with `.jar`.

After downloading, you can run the application.

### 🏃‍♂️ Running the Application
To run the otel-demo-app, follow these steps:

1. **Open Command Prompt (Windows) or Terminal (macOS/Linux).**
2. Navigate to the directory where you downloaded the `.jar` file. You can do this by using the `cd` command. For example:
   ```sh
   cd path/to/download
   ```
3. Run the application using the following command:
   ```sh
   java -jar otel-demo-app.jar
   ```

4. Once the application starts, you can access it in your web browser at `http://localhost:8080`.

### 🌐 Using the Application
Upon starting the application, you'll notice several features:

- **Structured JSON Logs:** Easily searchable logs help you troubleshoot issues quickly.
- **Distributed Tracing:** See how requests flow through your application.
- **Application Metrics:** Understand your app's performance with real-time stats.

You can monitor your application via Grafana Alloy and send logs to Grafana Cloud Loki for central storage.

### 🔍 Exploring Observability Features
The otel-demo-app includes several observability tools:

- **Logging:** Leverage structured JSON logs created using Logback with a Logstash encoder.
- **Tracing:** Integrate distributed tracing with the OpenTelemetry Java agent to see request paths.
- **Metrics:** Collect application metrics easily with Micrometer OTLP, which provides insights into application performance.

### 🛠️ Troubleshooting
If you face any issues while running the application, consider the following tips:

- Ensure you have Java installed. You can check this by running `java -version` in your command line.
- If you cannot connect to `http://localhost:8080`, verify that the application started correctly and is not blocked by a firewall.
- Check the command prompt or terminal for error messages for additional insights.

### 💬 Support
For further assistance, feel free to open an issue in the GitHub repository. Our community members often provide quick help.

Feel free to share your experience or contribute to the project!

## 📅 Release Notes
Stay updated with the latest changes and features by checking the release notes in the Releases section. Each entry will provide you with details about what's new or fixed.

1. Browse the [Releases page](https://github.com/kareem102/otel-demo-app/releases) regularly to see updates.
2. Each release will detail improvements or new features added to the software.

## 🔗 Related Topics
- [OpenTelemetry](https://opentelemetry.io/)
- [Micrometer](https://micrometer.io/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Grafana](https://grafana.com/)

By using the otel-demo-app, you can greatly enhance your application's observability and performance monitoring capabilities. Remember, having clear logging and metrics can make a significant difference in troubleshooting and improving your applications.