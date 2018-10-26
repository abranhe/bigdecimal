<p align="center">
	<br>
        <br>
	<br>
        <br>
        <img src="https://cdn.abranhe.com/projects/bigdecimal/logo.svg">
        <br>
        <br>
	<br>
        <br>
	<i>✖︎ Arithmetic operations in <b>BigDecimal</b> made easier</i>
</p>

<p align="center">
  <a href="https://search.maven.org/#artifactdetails%7Ccom.abranhe%7Cbigdecimal%7C1.0.1%7Cjar"><img src="https://maven-badges.herokuapp.com/maven-central/com.abranhe/bigdecimal/badge.svg"></a><a href="https://www.javadoc.io/doc/com.abranhe/bigdecimal/1.0.0">
	<img src="https://img.shields.io/badge/javadoc-1.0.1-blue.svg"></a>
  <a href="https://github.com/abranhe"><img src="https://abranhe.com/badge.svg"></a>
	<a href="https://cash.me/$abranhe"><img src="https://cdn.abranhe.com/badges/cash-me.svg"></a>
	<a href="https://www.patreon.com/abranhe"><img src="https://cdn.abranhe.com/badges/patreon.svg" /></a>
	<a href="https://github.com/abranhe/bigdecimal/blob/master/license"><img src="https://img.shields.io/github/license/abranhe/bigdecimal.svg" /></a>
  <a href="https://travis-ci.org/abranhe/bigdecimal"><img src="https://img.shields.io/travis/abranhe/bigdecimal.svg?logo=travis" /></a>
</p>

See **Big Decimal** [wiki](https://wiki.github.com/abranhe/bigdecimal)

# Why?

- No big deal working with **BigDecimal** operations
- Clean and focused
- Actively maintained

# Dependency Information

Download the [latest version JAR](https://github.com/abranhe/bigdecimal/releases/latest) to include it in your project

## Maven

```xml
<dependency>
        <groupId>com.abranhe.bigdecimal</groupId>
        <artifactId>bigdecimal</artifactId>
        <version>1.0.1</version>
</dependency>
```
## Gradle/Grails

```
compile 'com.abranhe:bigdecimal:1.0.1'
```
## Grape

```
@Grapes(
    @Grab(group='com.abranhe', module='bigdecimal', version='1.0.1')
)
```

## Ivy

```xml
<dependency org="com.abranhe" name="bigdecimal" rev="1.0.1"/>
```

# Using on your project

```java
import com.abranhe.bigdecimal.Operations;
```

## Usage

*Example 1*

```java
import com.abranhe.bigdecimal.Operations;
import java.math.BigDecimal;

public static void main(String[] args){

        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");

        System.out.println(Operations.add(x, y));
        //=> 1112222211.2222222211
}
```

*Example 2*

```java
import java.math.BigDecimal;

public static void main(String[] args){

        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");

        Operations o = new Operations();
        System.out.println(com.abranhe.bigdecimal.Operations.divide(x, y));
        //=> 0.12613
}
```
*Example 3*

```java
import com.abranhe.bigdecimal.Operations.divide;
import java.math.RoundingMode;
import java.math.BigDecimal;

public static void main(String[] args){

        BigDecimal x = new BigDecimal("124567890.0987654321");
        BigDecimal y = new BigDecimal("987654321.123456789");

        System.out.println(divide(x, y, 9, RoundingMode.FLOOR));
        //=> 0.126124988
}
```

# API

### Addition

> Add two BigDecimal numbers

```java
public static BigDecimal add(BigDecimal x, BigDecimal y);
```

**Parameters:**
  - **x** - Big decimal number
  - **y** - Big decimal number

**Returns:**

Addition of `x` plus `y`

### Subtraction

> Add two BigDecimal numbers

```java
public static BigDecimal subtract(BigDecimal x, BigDecimal y);
```

**Parameters:**
  - **x** - Big decimal number
  - **y** - Big decimal number

**Returns:**

Subtraction of `x` minus `y`

### Multiplication

> Multiplication between two BigDecimal numbers

```java
public static BigDecimal multiply(BigDecimal x, BigDecimal y);
```

**Parameters:**
  - **x** - Big decimal number
  - **y** - Big decimal number

**Returns:**

Multiplication of `x` times `y`

### Division

> Division between two BigDecimal numbers

```java
public static BigDecimal divide(BigDecimal x, BigDecimal y, int scale, RoundingMode roundingMode);
```

**Parameters:**
  - **x** - Big decimal number
  - **y** - Big decimal number
  - **scale** - Scale of the BigDecimal quotient to be returned
  - **roundingMode** - Rounding mode to apply

**Returns:**

Division of `x` by `y`

### Default Division

> Division between two BigDecimal numbers

```java
public static BigDecimal divide(BigDecimal x, BigDecimal y);
```

**Parameters:**

  - **x** - Big decimal number
  - **y** - Big decimal number

**Default**

  - ~~**scale**~~ - `5`
  - ~~**roundingMode**~~ - `CEILING`

**Returns:**

Division of `x` by `y`


# Team

|[![Carlos Abraham Logo](https://avatars3.githubusercontent.com/u/21347264?s=50)](https://abranhe.com)|
| :-: |
| [Carlos Abraham](https://github.com/abranhe) |


# License

[MIT](https://github.com/abranhe/bigdecimal/blob/master/license) License © [Carlos Abraham](https://github.com/abranhe/)
