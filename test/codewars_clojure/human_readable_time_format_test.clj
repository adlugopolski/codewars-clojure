(ns codewars-clojure.human-readable-time-format-test
  (:require [clojure.test :refer :all]
            [human-readable :refer [formatDuration]]))

(deftest test-human-readable-duration
  (is (= (formatDuration 0) "now"))
  (is (= (formatDuration 1) "1 second"))
  (is (= (formatDuration 62) "1 minute and 2 seconds"))
  (is (= (formatDuration 120) "2 minutes"))
  (is (= (formatDuration 3600) "1 hour"))
  (is (= (formatDuration 3662) "1 hour, 1 minute and 2 seconds")))
