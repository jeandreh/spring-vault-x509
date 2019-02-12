listener "tcp" {
  address = "127.0.0.1:8200"
  tls_cert_file = "server.crt"
  tls_key_file  = "server.key"
}

storage "file" {
  path = "/Users/jeandre/Temp/vault-data"
}

