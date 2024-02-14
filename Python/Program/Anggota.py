class Anggota:
    # Private Attributes
    __id = ""
    __nama = ""
    __bidang = ""
    __partai = ""
    
    # Constructor
    def __init__(self, id = "", nama = "", bidang = "", partai = ""):
        self.__id = id
        self.__nama = nama
        self.__bidang = bidang
        self.__partai = partai
        
    # Getter and Setter
    # Get id
    def get_id(self):
        return self.__id
    
    # Get nama
    def get_nama(self):
        return self.__nama
    
    # Get bidang 
    def get_bidang(self):
        return self.__bidang
    
    # Get partai
    def get_partai(self):
        return self.__partai
    
    # Set id
    def set_id(self, id):
        self.__id = id
        
    # Set nama
    def set_nama(self, nama):
        self.__nama = nama
        
    # Set bidang
    def set_bidang(self, bidang):
        self.__bidang = bidang
        
    # Set partai
    def set_partai(self, partai):
        self.__partai = partai
        

    