# Toxiproxy Latency Simulation Guide

## Tool Overview: Toxiproxy

**Toxiproxy** is an open-source tool developed by Shopify to simulate network conditions such as:
- Latency
- Bandwidth limits
- Packet loss
- Slow or unstable connections

It acts as a **TCP proxy** between your application and a service (e.g. PostgreSQL), allowing you to inject "toxics" (network degradations).

GitHub: https://github.com/Shopify/toxiproxy

---

## Setup Scenario

- Real DB endpoint: `127.0.0.1:5432`
- Proxy endpoint: `127.0.0.1:15432`
- Proxy name: `pgbouncer_proxy`

---

## Step-by-Step Usage

### 1. Start the Proxy Server

```bash
toxiproxy-server-windows-amd64
```

### 2. Create the Proxy

```bash
toxiproxy-cli-windows-amd64 create \
  -l 127.0.0.1:15432 \
  -u 127.0.0.1:5432 \
  pgbouncer_proxy
```

### 3. Add Downstream Latency (Server → Client)

```bash
toxiproxy-cli-windows-amd64 toxic add \
  -n pgbouncer_toxic_down \
  -t latency \
  -a latency=16 \
  pgbouncer_proxy
```

### 4. Add Upstream Latency (Client → Server)

```bash

toxiproxy-cli-windows-amd64 toxic add \
  -n pgbouncer_toxic_up \
  -t latency \
  -a latency=16 \
  -u pgbouncer_proxy
```
