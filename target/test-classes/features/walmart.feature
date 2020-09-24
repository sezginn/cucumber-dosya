@walmart
  Feature: Walmart Urun Arama
    Scenario Outline: TC08_kullanici walmartta urun arar
      Given kullanici "http://walmart.com" sayfasina gider
      And kullanici walmart aramakutusuna "<urunismi>" yazar ve arar
      Then kullanici walmart sonuc sayisini ekrana yazdirir

      Examples: Test Verileri
        | urunismi |
      | calculator |
      | watch      |
      | flower     |