# Spring-Ai-with-Ollama-Prompt
### Purpose
To create a demo project to use Spring AI to connect with locally deployed Large Language Models. 

---

### What is Spring AI, LLM and Ollama?
#### Spring AI 
Java based application framework for AI based applications. Using Spring AI framework, we can create applications of generative AI using java language. This provides support for OpenAI, Bedrock, Ollama, DeepSeek AI etc.

#### What is Large Language Model(LLM)?
LLM is a type of model designed to process and generate human-like text based on training data. They are trained on billions of words from various sources(books, articles, websites). They can generate new data.

#### What is Ollama?
Ollama is a software to run open source llm locally. This tool will not need internet to run the llm model.

---
### Features
1. Integrate with locally running LLM model using ollam.
2. A UI page for prompt search.
3. Integrate LLM using Spring AI(Java based) framework.
---
### Prerequisites
Before running the application, please ensure you have these application installed:
1. Backend: Java 17+, Maven
2. An IDE (I am using Intellij)
3. Ollama
---
### Ollama Setup
1. Download software using this link. https://ollama.com/download
2. Install into the sytem.
3. Go to command line and type "ollama --version"
4. Pull/download LLM model to run on ollama. Command "ollama pull qwen2.5".
5. Run the model. "ollama run qwen2.5"


## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/rjtmangla/Spring-Ai-with-Ollama-Prompt.git
cd Spring-Ai-with-Ollama-Prompt
```

### 2. Build the Project
Use Maven to clean and build the project:

```bash
Copy code
mvn clean install
```

### 3. Run the Application
Start the application 

### 4. Access the Application
Once the application is running, access the APIs or web interface at:
```
http://localhost:8080
```

## Folder Structure 🗂️
- src/main/java: Contains the source code for the application.
    - com.gupta.AI.demo.SpringAiDemoApplication: Starter file for prject.
    - controller: REST controllers for API endpoints.
    - service: Business logic for AI functionalities.
- src/main/resources: Configuration files, templates, and static resources.
