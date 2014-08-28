import hashlib, binascii

def generate_sha256(source, salt=b'agkppwlcm!@$ffjax', itertime=100):
    dk = hashlib.pbkdf2_hmac('sha256', source, salt, itertime)
    return binascii.hexlify(dk)

