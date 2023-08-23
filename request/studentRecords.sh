# First request
curl -X POST -H "Content-Type: application/json" -d '{
  "name": "John Doe"
}' http://localhost:8097/student/insert

# Second request
curl -X POST -H "Content-Type: application/json" -d '{
  "name": "Jane Smith"
}' http://localhost:8097/student/insert

# Third request
curl -X POST -H "Content-Type: application/json" -d '{
  "name": "Michael Johnson"
}' http://localhost:8097/student/insert

# Fourth request
curl -X POST -H "Content-Type: application/json" -d '{
  "name": "Emily Williams"
}' http://localhost:8097/student/insert

# Fifth request
curl -X POST -H "Content-Type: application/json" -d '{
  "name": "Daniel Brown"
}' http://localhost:8097/student/insert
