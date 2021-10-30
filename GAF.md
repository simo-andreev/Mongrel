# Mongrell: Goals & Features

------
// v.001

## Main Goal:

    Provide a persistance service exposing a REST API of CRUD opperations on pre-defined models, that is easy af to prop-up & update.

For use in prototyping and when I just need a networked DB and can't be arsed to do it properly.

------

## Main Features

1) Allows **easy** definition of Models (effectively the schema)
2) Generates the relevant CRUD functions for relevant models
3) Generates and exposes a REST API for the CRUD operations
4) Can prop-up a Mongo DB if no external data-provider given
5) Migration support
6) Supports adequate* data-sec

7) TBD - paging; access-control per model; mutation/business-logic custom layer allowance; non-meme DB provider

---
###### *adequate being defined as
 > "Whatever I feel is good-enough for prototyping projects that will get abandoned anyway" 
###### As such - no real guarantees given. If somehow not obvious - this ain't no enterprise software

---
---
## Features

### 1) Allows **easy** definition of Models (effectively the schema)
    - Models are defined as a data classes 
    - Models are marked for export using an Annotation
    - Model exposure is configured using additional annots and annot params

### 2) Generates the relevant CRUD functions for relevant models
    - Models marked with annot automatically have CRUD functions generated and linked to DB
    + Allow custom logic when invoked
    + Allow exluding certain opps
    + Allow access-control on certain opps

### 3) Generates and exposes a REST API for the CRUD operations
    - Models marked with annot automatically have REST endpoints exposed for the CRUD functions
    + Allow custom logic when invoked
    + Allow exluding certain opps
    + Allow access-control on certain opps
    + Generate API docs

### 4) Can prop-up a Mongo DB if no external data-provider given
    - Allow for the execution to define an external [Mongo] instance
        + Allow for other DB providers
    - If no external [Mongo] provided - prop-up a local instance and use that    
    + Allow for custom logic regiarding DB prop

### 5) Migration support
    - Provision for schema/model versioning
    - Add a Migration layer that can run user-defined opperations when a version change is detected

### 6) Supports adequate* data-sec
    - Support for TLS & HTTPS
    - User access-control (global)
    + User access-control (specific)

### 7) TBD - paging; access-control per model; mutation/business-logic custom layer allowance; non-meme DB provider
    + Nice to have shit that I may or may not attempt to add. Some of it is covered by previous points

---

# Feature details

---

## 1) Allows **easy** definition of Models (effectively the schema)
### Goal
TODO
### Description
TODO

---

## 2) Generates the relevant CRUD functions for relevant models
### Goal
TODO
### Description
TODO

---

## 3) Generates and exposes a REST API for the CRUD operations
### Goal
TODO
### Description
TODO

---

## 4) Can prop-up a Mongo DB if no external data-provider given
### Goal
TODO
### Description
TODO

---

## 5) Migration support
### Goal
TODO
### Description
TODO

---

## 6) Supports adequate* data-sec
### Goal
TODO
### Description
TODO

---