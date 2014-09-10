import hashlib, binascii

def gen_sha256(source, salt=b'agkppwlcm!@$ffjax', itertime=100):
    dk = hashlib.pbkdf2_hmac('sha256', source, salt, itertime)
    return binascii.hexlify(dk)

def gen_md5(source, salt='agkppwlcm!@$ffjax'):
    m = hashlib.md5()
    m.update(source + salt)
    return m.hexdigest()

