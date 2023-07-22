# USAGE examples

Run in local chrome:

```bash
gradle clean test
```

Run in local chrome:

```bash
gradle clean test -Dbrowser=chrome
```

Run on remote hub with explicit auth:

```bash
gradle clean test -Denv=remote
```

Serve report:

```bash
allure serve build/allure-results
```
