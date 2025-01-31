# Spring-Ai-with-Ollama-Prompt

## Purpose
This project demonstrates how to use Spring AI to connect with locally deployed Large Language Models (LLMs).

---

## What are Spring AI, LLM, and Ollama?

### Spring AI
Spring AI is a Java-based application framework for building AI-powered applications. It enables developers to integrate generative AI into Java applications and supports various AI providers, including OpenAI, Bedrock, Ollama, and DeepSeek AI.

### What is a Large Language Model (LLM)?
A Large Language Model (LLM) is an AI model designed to process and generate human-like text based on vast amounts of training data. These models are trained on billions of words from diverse sources such as books, articles, and websites. They can generate text, answer questions, and perform various NLP tasks.

### What is Ollama?
Ollama is a software tool that allows users to run open-source LLMs locally. It enables AI processing without requiring an internet connection.

---

## Features
1. Integration with a locally running LLM using Ollama.
2. A user interface for prompt-based searches.
3. LLM integration using the Spring AI (Java-based) framework.

---

## Prerequisites
Before running the application, ensure the following are installed:

1. **Backend:** Java 17+ and Maven.
2. **An IDE:** IntelliJ IDEA (or any preferred Java IDE).
3. **Ollama:** To run the local LLM.

---

## Ollama Setup
1. Download the software from [Ollama's official site](https://ollama.com/download).
2. Install it on your system.
3. Verify the installation by running:
   ```bash
   ollama --version
   ```
4. Pull/download an LLM model to run with Ollama:
   ```bash
   ollama pull qwen2.5
   ```
5. Run the model:
   ```bash
   ollama run qwen2.5
   ```

---

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/rjtmangla/Spring-AI-with-Ollama-Prompt.git
cd Spring-AI-with-Ollama-Prompt
```

### 2. Build the Project
Use Maven to clean and build the project:
```bash
mvn clean install
```

### 3. Run the Application
Start the application:
```bash
mvn spring-boot:run
```

### 4. Access the Application
Once the application is running, open your browser and visit:
```
http://localhost:8080
```

---

## Folder Structure 🗂️
```
Spring-AI-with-Ollama-Prompt/
│── src/main/java
│   ├── com.gupta.ai.demo.SpringAiDemoApplication  # Main application starter
│   ├── controller  # REST controllers for API endpoints
│   ├── service  # Business logic for AI functionalities
│── src/main/resources  # Configuration files, templates, and static resources
```
