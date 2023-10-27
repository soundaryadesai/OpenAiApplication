1. Embedding API Curl:

curl --location 'https://api.openai.com/v1/embeddings' \
--header 'Content-Type: application/json' \
--data '{
    "input": "dog"
}'

2. Chat GPT API Curl:

curl --location 'http://localhost:8080/api/chat/gpt' \
--header 'Content-Type: application/json' \
--data '{
    "prompt": "hello, Can you tell me what is a Fibonacci Number?"
}'
