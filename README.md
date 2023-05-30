# CSV Parser TDD Kata

Domain modelling presentation - examples
<hr>

# From anemic to rich
We are going to live refactor the class AdministrationAgreementAnemic, which is:
* an object representing an administration agreement
* implemented with the anemic domain model antipattern.

## From mutable to immutable
Let's ditch the mutable state and create an object that once created cannot be mutated.

## Java records? Lombok?
Of course.

## Let's heal our primitive obsession
Because an email it's not just a String, right? It's an Email.

## Let's ban the illegal states
Most bugs come from permitting illegal states in objects. We don't do that anymore. We don't do bugs anymore.

## What about illegal states spanning multiple objects?
Just like I said, we don't do bugs anymore.

## Let's add a couple of domain events, just for fun.
Let's demonstrate domain services, as well.