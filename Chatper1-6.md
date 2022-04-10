# AOP

### 6.6.1 트랜잭션 정의
```text
트랙잭션 전파 : 트랜잭션의 경계에서 이미 진행 중인 트랜잭션이 있을 때 또는 없을 때 어떻게 동작할 것인가를 결정하는 방식

트랜잭션 전파 속성
* PROPAGATION REQUIRED : 진행 중인 트랜잭션이 없으면 새로 시 작하고， 이미 시작된 트랜잭션이 있으면 이에 참여한다.
* PROPAGATION_REQUIRES_NEW : 항상 새로운 트랜잭션을 시작한다. 즉 앞에서 시작된 트랜잭션이 있든 없든 상관없 이 새로운트랜잭션을만들어서 독자적으로동작하게 한다.
* PROPAGATION_NOT_SUPPORTED : 이 속성을 사용하면 트랜잭션 없이 동작하도록 만들 수도 있다. 진행 중인 트랜잭션 이 있어도 무시한다.
```