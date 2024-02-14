<?php 
    class Table {
        private $headers = [];
        private $data = [];
    
        public function __construct($headers) {
            $this->headers = $headers;
        }
    
        public function addRow($rowData) {
            $this->data[] = $rowData;
            echo"<br>";
        }
    
        public function render() {
            // Print headers
            echo implode(',', $this->headers) . PHP_EOL;
    
            // Print data rows
            foreach ($this->data as $row) {
                echo implode(',', $row) . PHP_EOL;
            }
        }
    }
    
?>