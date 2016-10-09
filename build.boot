(def +version+ "0.1.0-SNAPSHOT")

(set-env!
 :resource-paths #{"src"}
 :dependencies '[[adzerk/bootlaces "0.1.11" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])
(bootlaces! +version+)

(task-options!
 pom {:project 'nl.michielborkent/boot.bundle.edn
      :version +version+
      :description "Michiel Borkent's boot bundle"
      :url "https://github.com/borkdude/boot.bundle.edn"
      :scm {:url "https://github.com/borkdude/boot.bundle.edn"}
      :license {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})
