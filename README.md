BMQuestao02:

![Modelo](Modelo.png)


BMQuestao08:

Na questão abaixo o erro se encontra no tipo de retorno,
pois a função retorna boolean, ao invés de int
```java
int maior()
{
    if (num1 > num2)
        return true;
    else return false;
}
```
Além disso, também há um erro quanto ao tipo de retorno, pois a função foi declarada como não possuindo retorno,
no entanto, ela retorna um valor int.

````java
void menor()
{
    if (num1 < num2)
        return num1;
    else return num2;
}
````

BMQuestao09:

O erro no código abaixo é a ausência do tipo de retorno do método main

```java
class TesteImpressao
 {
main(String[] args)
{
System.out.println("7+2="+(7+2));
System.out.println(“7-2=”+(7-2));
System.out.println(“7*2=”+(7*2));
System.out.println(“7/2=”+(7/2));
return true;
}
}
```