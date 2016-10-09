# boot.bundle.edn
My boot.bundle.edn file. See [boot-bundle](https://github.com/borkdude/boot-bundle) for more details.

Example usage:

```clojure
(set-env!
 :dependencies '[[boot-bundle "0.1.0-SNAPSHOT" :scope "test"]
                 [nl.michielborkent/boot.bundle.edn
                  "0.1.0-SNAPSHOT"
                  :scope "test"]])

(require '[boot-bundle :refer [expand-keywords]])

(set-env!
 :dependencies (expand-keywords '[:clojure]))
```
