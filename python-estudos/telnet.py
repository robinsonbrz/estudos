from subprocess import call
import re

def telnet():

        hosts = []
        dir_path = '/home/svn/bkp_victor/telnetao/'

        leitura_hosts = open(dir_path + 'servidores_telnet.txt', 'r+')

        for line in leitura_hosts:
                if (line != ' '):
                        hosts.append(line)
                else:
                        pass

                for host in hosts:
                        print host
                        call(['echo','^]','|','telnet', host, '22', '-t', '10'])
                        call(['echo','^]'])
telnet()