# Java SAX

![SAX](https://i0.wp.com/www.javatechblog.com/wp-content/uploads/2016/07/SAX-Parser-in-Java.jpg)

3 PARTS

  object
  
  handler extends DefaultHandler
  
  saxParser.pars("xml_path", handler)
  
  
STAPS

0. Импорт 
```java 
org.xml.sax.*;
javax.xml.parsers.*;
```

1. Создаем объект, в который парсер будет сохранять результаты. Геттеры и сеттеры. toString()

2.1. Coздаем Headler extends DefaultHendler

2.2. Создаем коллекцию, в которой будем сохранять готовые после парсинга и геттер для нее.

2.3. Подготавливаем триггеры событий (bool)

2.4. Override startElement
```java
  @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("tag")) {
            String attr_name = attributes.getValue("attr_name");            
            pars_obj = new Pars_obj();//объект в который будем сохранять результаты парсера
            if (attr_name instanceof String) {//проверка на null
                pars_obj.set_attr_name(Integer.valueOf(attr_name));//string to int and set_attr_name
            }
            if (plants == null) {
                plants = new ArrayList<>();
            }
        } else if (qName.equalsIgnoreCase("subtag1")) {
            bSubtag1 = true;//переводим триггер для данного события
        } else if (qName.equalsIgnoreCase("subtag2")) {
            bSubtag2 = true;
        } 
    }
```
2.5. Override endElement
```java
  @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("tag")) {
            pars_obj_array.add(pars_obj);//добавляем готовый объект в коллекцию
        }
    }
```
2.6. Override characters
```java
   @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bSubtag1) {//если триггер в true
            pars_obj.setsubtag1(new String(ch, start, length));//текст добавляем сеттером в объект
            bSubtag1 = false;//после выполнения задачи переводим триггер в false
        } else if (bSubtag2) {
            pars_obj.setsubtag2(new String(ch, start, length));
            bSubtag2 = false;
        } 
    }
```
3.0. 
```java
SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
```

3.1.
```java
saxParserFactory.setValidating(true);//optional -default is non-validating
```

3.2. 
```java 
SAXParser saxParser = saxParserFactory.newSAXParser();
```

3.3. 
```java 
Handler handler = new Handler(); 
```

3.4. 
```java 
saxParser.parse(XML_PATH, handler); 
```

3.5. 
```java
ArrayList<pars_obj> obj = handler.getPars_obj_array();
```

3.6. Можно работать с obj - коллекцией объектов полученных с помощью SAX парсера
