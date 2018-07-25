# Easy Math Series

<p align="center">
        ✖︎ Arithmetic operation in BigDecimal made easier
</p>

<p align="center">
	<!-- <a href="https://maven-badges.herokuapp.com/maven-central/com.abranhe.easymath/EasyMathBigDecimal/badge.svg"><img src="#"></a> -->
        <a href="https://github.com/abranhe"><img src="https://abranhe.com/badge.svg"></a>
	<a href="https://cash.me/$abranhe"><img src="https://cdn.abraham.gq/badges/cash-me.svg"></a>
	<a href="https://www.patreon.com/abranhe"><img src="https://cdn.abraham.gq/badges/patreon.svg" /></a>
	<a href="https://github.com/abranhe/decamelize/blob/master/LICENSE"><img src="https://img.shields.io/github/license/abranhe/decamelize.svg" /></a>
  <a href="https://travis-ci.org/abranhe/decamelize"><img src="https://img.shields.io/travis/abranhe/decamelize.svg?logo=travis" /></a>
</p>



# Adding to your project

```xml
<dependency>
        <groupId>com.abranhe</groupId>
        <artifactId>EasyMathBigDecimal</artifactId>
        <version>0.0.1</version>
</dependency>
```

# Why?

- Arithmetic operation in BigDecimal made easier
- Clean and focused
- Actively maintained

## Usage

```java
import java.math.BigDecimal;
import com.abranhe.easymath.EMBigDecimal;

public static void main(String[] args){
        
        BigDecimal bd1 = new BigDecimal("124567890.0987654321");
        BigDecimal add = EMBigDecimal.add(bd1, bd2);
        //=> 1112222211.2222222211

        BigDecimal bd2 = new BigDecimal("987654321.123456789");
        BigDecimal sub = EMBigDecimal.subtract(bd1, bd2);
        //=> 863086431.0246913569
 }
```

# Team

|[![Carlos Abraham Logo](https://avatars3.githubusercontent.com/u/21347264?s=50&v=4)](https://abranhe.com)|
| :-: |
| [Carlos Abraham](https://github.com/abranhe) |


# License

[MIT](https://github.com/abranhe/EasyMath-BigDecimal/blob/master/LICENSE) License © [Carlos Abraham](https://github.com/19cah/)